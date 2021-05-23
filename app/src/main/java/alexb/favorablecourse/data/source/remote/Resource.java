package alexb.favorablecourse.data.source.remote;

import androidx.annotation.NonNull;

public class Resource<T> {

    class Loading extends Resource<T> {
    }

    class Success extends Resource<T> {

        @NonNull
        T data;

        public Success(T data) {
            this.data = data;
        }
    }

    class Failure extends Resource<T> {

        @NonNull
        Exception exception;

        public Failure(Exception exception) {
            this.exception = exception;
        }
    }
}
