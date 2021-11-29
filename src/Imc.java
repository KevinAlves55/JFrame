import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/* 
 	Existem duas formas de usar essa classe que s�o:
 	
 	- Criar uma inst�ncia do objeto
 	- Usar a heran�a da classe
 	
*/

/*
	Forma de cria��o a partir de um objeto instanciado:
	
	public class Imc {
		 	JFrame  jf = new JFrame(); // Forma da inst�ncia
		 	
		 	public Imc() {
		 		jf.setTitle("Calculadora De Imc"); // Definir um t�tulo
		 		jf.setSize(500, 400); // Definir o tamanho
				jf.setVisible(true); // Deixa a janela vis�vel
		 	}
		 	
		 	public static void main(String[] args) {
				new Imc();
			}
	}
*/

// Uso de heran�a da classe
public class Imc extends JFrame implements ActionListener {

	// Cria��o dos objetos, mesmo usando heran�a

	JLabel lblCalcularImc = new JLabel("C�lculo do IMC"); // Cria��o do objeto para texto
	JLabel lblPeso = new JLabel("Peso"); // Cria��o do objeto peso
	JLabel lblAltura = new JLabel("Altura"); // Cria��o do objeto altura
	JTextField txtPeso = new JTextField(); // Cria��o do campo de armazenamento de peso
	JTextField txtAltura = new JTextField(); // Cria��o do campo de armazenamento de altura
	JButton btnCalculaImc = new JButton("Calcular IMC"); // Cria��o do bot�o que calcula
	JButton btnSaiImc = new JButton("Sair"); // Cria��o do bot�o de sa�da

	// Formata��es para cor e fonte
	Font fontTitle = new Font("SansSarif", Font.BOLD, 15);
	Color cor = new Color(0, 0, 255);

	// Classe Imc

	public Imc() {
		
		btnSaiImc.addActionListener(this);
		btnCalculaImc.addActionListener(this);

		setLayout(null); // Temos que desabilitar o layout padr�o

		// JLabel, formata��es do t�tulo
		lblCalcularImc.setBounds(150, 30, 130, 20); // Configura as posi��es e tamanhos da caixa do t�tulo
		add(lblCalcularImc); // Adiciona o componente

		// Formata��es
		lblCalcularImc.setFont(fontTitle);
		lblCalcularImc.setForeground(cor);

		// JLabel, formata��es do peso
		lblPeso.setBounds(85, 71, 100, 20); // Configura as posi��es e tamanhos do peso
		add(lblPeso); // Adiciona o componente

		// Formata��es
		lblPeso.setFont(fontTitle);
		lblPeso.setForeground(cor);

		// JTextField, formata��es para campo do peso
		txtPeso.setBounds(155, 74, 100, 20); // Configura o input da caixa do peso
		add(txtPeso); // Adiciona o componente

		// JLabel, formata��es de altura
		lblAltura.setBounds(85, 121, 100, 20); // Configura as posi��es e tamanhos da altura
		add(lblAltura); // Adiciona o componente

		// Formata��es
		lblAltura.setFont(fontTitle);
		lblAltura.setForeground(cor);

		// JTextField, formata��es para campo da altura
		txtAltura.setBounds(155, 123, 100, 20); // Configura o input da caixa da altura
		add(txtAltura); // Adiciona o componente

		// JButton, formata��es para o bot�o de calcular
		btnCalculaImc.setBounds(40, 190, 130, 20); // Configura as posi��es do bot�o
		add(btnCalculaImc); // Adiciona o componente

		// Formata��es
		btnCalculaImc.setForeground(Color.blue);
		btnCalculaImc.setFont(fontTitle);

		// JButton, formata��es para o bot�o de sa�da
		btnSaiImc.setBounds(210, 190, 130, 20); // Configura as posi��es do bot�o
		add(btnSaiImc); // Adiciona o componente

		// Formata��es
		btnSaiImc.setForeground(Color.blue);
		btnSaiImc.setFont(fontTitle);

		// JFrame, formata��es para a frame
		setTitle("Sistema de sa�de"); // T�tulo da Janela
		setSize(400, 300); // Tamanho da Janela (px)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Realmente fecha o programa
		setLocationRelativeTo(null); // Configura a posi��o
		setResizable(false); // Configurar o redirecionamento para falso
		//getContentPane().setBackground(Color.gray);
		setVisible(true); // Deixa a Janela vis�vel
	}
	
	public void actionPerformed(ActionEvent e) {
		if (!txtPeso.getText().equals("") && !txtAltura.getText().equals("")) {
			double peso = Double.parseDouble(txtPeso.getText());
			double altura = Double.parseDouble(txtAltura.getText());
			double imc = peso / Math.pow(altura, 2);
			JOptionPane.showMessageDialog(null, "Imc: " + imc);
		}
		else {
			if (e.getSource() == btnSaiImc) {
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) {
		new Imc();
	}
}