package Conection;
import com.fazecast.jSerialComm.SerialPort;
import java.util.Timer;


public class MainConect {

	public static void main(String[] args) {
		
		long timeStart = System.currentTimeMillis();
		SerialPort sp = SerialPort.getCommPort("/dev/tty.usbserial-1420");
		sp.setComPortParameters(9600,  Byte.SIZE, SerialPort.ONE_STOP_BIT, SerialPort.NO_PARITY);
		sp.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING, 0, 0);
		boolean isOpened = sp.openPort();
		if(!isOpened) {
			throw new IllegalStateException("Failed to open serial port");
		}
		
		Runtime.getRuntime().addShutdownHook(new Thread(() -> sp.closePort()));
		
		Timer timer = new Timer();
		TimerScheduleHandler timedSchedule = new TimerScheduleHandler(timeStart);
		
		sp.addDataListener(timedSchedule);
		
		System.out.println("Listen: " + timedSchedule.getListeningEvents());
		timer.schedule(timedSchedule, 0, 1000);
		
	}

}
