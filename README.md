@Async  annotation using in Springboot application

->Asynchronous processing is helpful when we want to offload time-consuming tasks to separate threads, improving the overall responsiveness of our application.

The @Async annotation can be used with any method that is declared in a Spring bean. However, there are a few things to keep in mind when using the annotation:

1].The method must be public.
2].The method must not throw checked exceptions. If the method throws a checked exception, the exception will be wrapped in a runtime exception and thrown to the calling thread.
3].The method must return a value that implements the Future interface (basically CompletableFuture). This allows the calling thread to get the result of the asynchronous task once it has been completed.
4].Or the method must have no return type that is void.