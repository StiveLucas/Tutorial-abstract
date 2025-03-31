import models.Filme;
import models.abstrato.Video;

public class Main{
    public static void main(String[] args) {
        Filme f = new Filme("Gokuuuuuuuuu");
        Video v = new Video("Vegetaaa");

        f.play();
        v.play();

        //Abstract é usar o mesmo metodo em varios objetos.
    }
}