package Init;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Main {

	public static void main(String[] args) {
		
		ventanaInicio();

	}

	private static void ventanaInicio() {
		
		InterInit ventana = new InterInit();
		ventana.setVisible(true);
		
	}
	
	 public final void setLectArduReciv(LecturaFromArduino let){
	        /*inicializa el objeto recibido del sensado desde arudino*/
	        lectArdReciv=let;
	    }
	 
	 public void detenerValidBotVentJuego(boolean  estado){
	        /*detiene o reanuda la valición de los resultados que se obtienen de los
	        hilos, dependiendo si el usuario se encuentra en la ventanaJuego*/
	        permitBotArdVentJueg=estado;
	    }
	    public final void iniciaValidBotArd(){
	        obtDatArd=new Thread(this);
	        obtDatArd.start();
	    }
	    
	    @Override
	    public void run() {
	        
	        /*método que ejecuta acciones en la ventana de menú del jugador, de acuerdo
	        a los datos que se reciben de los botones que se presionan desde el tapete*/
	        String [] datosArd;
	        while (permitBotArdVentJueg) {            
	            datosArd = lectArdReciv.getDatRecArduino();
	            //System.out.println("Datos de arduino: "+datosArd[0]+"  "+datosArd[1]+"  "+datosArd[2]+"  "+datosArd[3]);
	            System.out.println("Datos de arduino: "+datosArd[0]);
	            /*proceso de validar qué número de botón se ha presionado*/
	            switch(datosArd[0]){
	                case "1":
	                    jbIniciar.doClick();
	                    break;
	                case "2":
	                    jbRanking.doClick();
	                    break;
	                case "3":
	                    jbAyuda.doClick();
	                    break;
	                case "4":
	                    jbSalir.doClick();
	                    break;
	                default:
	                    break;
	            }
	            try {
	                Thread.sleep(100);
	            } catch (InterruptedException ex) {
	                Logger.getLogger(InterInit.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
	    }

}
