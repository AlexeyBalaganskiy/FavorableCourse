package alexb.favorablecourse.data.source.remote;

import androidx.annotation.NonNull;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

import alexb.favorablecourse.data.converter.ConverterStreamToString;

import static alexb.favorablecourse.data.source.remote.constant.SystemVariable.CONNECTION_TIMEOUT;
import static alexb.favorablecourse.data.source.remote.constant.SystemVariable.READ_TIMEOUT;
import static alexb.favorablecourse.data.source.remote.constant.SystemVariable.REQUEST_METHOD_GET;

public class HttpClient {

    private URL mUrl;
    private final ConverterStreamToString mConverter;

    public void setUrl(@NonNull String url) {
        try {
            mUrl = new URL(Objects.requireNonNull(url));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public HttpClient() {
        mConverter = new ConverterStreamToString();
    }

    public String requestCall() {
        return connectToApi();
    }

    private String connectToApi() {
        HttpURLConnection connection;
        InputStream in = null;
        try {
            connection = (HttpURLConnection) mUrl.openConnection();
            connection.setRequestMethod(REQUEST_METHOD_GET);
            connection.setReadTimeout(READ_TIMEOUT);
            connection.setConnectTimeout(CONNECTION_TIMEOUT);
            connection.connect();
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                in = connection.getErrorStream();
            } else {
                in = connection.getInputStream();
            }
            mConverter.setCharset(getEncoding(connection.getContentType()));
            return mConverter.convert(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                Objects.requireNonNull(in).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private String getEncoding(String contentType) {
        return contentType.substring(contentType.lastIndexOf("=") + 1);
    }
}
