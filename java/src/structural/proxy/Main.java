package structural.proxy;

public class Main {
    public static void main(String[] args) {
        ProxyImage image1 = new ProxyImage("image_045.jpg");
        ProxyImage image2 = new ProxyImage("image_046.jpg");

        image1.displayImage();
        image2.displayImage();

        image1.displayImage();

        //  Loading image_045.jpg
        //  Displaying image_045.jpg

        //  Loading image_046.jpg
        //  Displaying image_045.jpg

        //  The image will not be loaded on the second call,
        //  since it has been previously cached
        //  Displaying image_046.jpg -

    }
}
