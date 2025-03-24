public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("highres_photo.jpg");

        // Image is not loaded yet
        System.out.println("Image proxy created...");

        // Now image is loaded and displayed
        image.display();

        // The image will not be loaded again, just displayed
        image.display();
    }
}
