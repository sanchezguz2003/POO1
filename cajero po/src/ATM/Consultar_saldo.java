package ATM;

import javax.swing.JOptionPane;

public class Consultar_saldo extends Plantilla {

	@Override
	public void Transacciones() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Tu saldo actual es: " + getSaldo());
	}

}
