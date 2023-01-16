import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class dialogo1
{
    public static void main(String[] args)
    {
        DecimalFormat dft = new DecimalFormat("0.##");
        //JOptionPane.showMessageDialog(null, "Te \nodio \nJAVA :3"); //Mensaje emergente
        /*
        * Ingreso de una variable
        * */
        /*
        String nombre = JOptionPane.showInputDialog("Cual es el nombre: ");
        String mensaje = JOptionPane.showInputDialog("Bienvenido "  + nombre +  " a la programacion orientada a obejtos");

        JOptionPane.showMessageDialog(null, mensaje);

         */

        try
        {
            double estatura = Double.parseDouble(JOptionPane.showInputDialog("Estatura"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
            double resultado = peso / Math.pow(estatura, 2);
            JOptionPane.showMessageDialog(null, "Resultado: \n" + dft.format(resultado));
        }
        catch (Exception exception)
        {
            JOptionPane.showMessageDialog(null,"Esta mal escrito: \n" + exception );
            //JOptionPane.showMessageDialog(null,"dasdad",1,2,1);
        }
    }
}
