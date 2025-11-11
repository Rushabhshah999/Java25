import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScopedValues {

    static final ScopedValue<String> USER = ScopedValue.newInstance();

    static final ScopedValue<String> USER1 = ScopedValue.newInstance();

    public static void main(String[] args) throws Exception {

       ExecutorService executorService =  Executors.newVirtualThreadPerTaskExecutor();

        executorService.submit(  () -> ScopedValue.where(USER1,"Rushah").run(()-> {
            System.out.print("user1" + USER1.get());
        }));


        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> ScopedValue.where(USER, "Alice").run(() -> {
                System.out.println("Thread: " + Thread.currentThread());
                System.out.println("User: " + USER.get());
            }));

            executor.submit(() -> ScopedValue.where(USER, "Bob").run(() -> {
                System.out.println("Thread: " + Thread.currentThread());
                System.out.println("User: " + USER.get());
            }));

            executor.submit(()-> ScopedValue.where(USER, "Rushah").run( () -> {
                System.out.println("Thread: " + Thread.currentThread());
                System.out.println("User: " + USER.get());
            } ));

            // Optional delay to ensure output appears before main exits
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
