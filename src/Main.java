import java.awt.*;

public class Main {
    public static void main(String[] args) {
        BasicStructure audi=new BasicStructure();
        audi.color="Black";
        audi.model="A3";
        audi.power="5000cc";

        Engine x=new Engine();
        x.cylinder="8";
        x.size="1234cc";
        x.weight="6543k";


        Color col=new Color();
        col.colorLights="True";
        col.colorTire="false";
        col.colorWindows="True";

        Lights neon=new Lights();
        neon.color="red";
        neon.size="15cm";
        neon.intensity="7675lumin";

    }
}