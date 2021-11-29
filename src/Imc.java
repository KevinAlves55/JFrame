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
 	Existem duas formas de usar essa classe que são:
 	
 	- Criar uma instância do objeto
 	- Usar a herança da classe
 	
*/

/*
	Forma de criação a partir de um objeto instanciado:
	
	public class Imc {
		 	JFrame  jf = new JFrame(); // Forma da instância
		 	
		 	public Imc() {
		 		jf.setTitle("Calculadora De Imc"); // Definir um título
		 		jf.setSize(500, 400); // Definir o tamanho
				jf.setVisible(true); // Deixa a janela visível
		 	}
		 	
		 	public static void main(String[] args) {
				new Imc();
			}
	}
*/

// Uso de herança da classe
public class Imc extends JFrame implements ActionListener {

	// Criação dos objetos, mesmo usando herança

	JLabel lblCalcularImc = new JLabel("Cálculo do IMC"); // Criação do objeto para texto
	JLabel lblPeso = new JLabel("Peso"); // Criação do objeto peso
	JLabel lblAltura = new JLabel("Altura"); // Criação do objeto altura
	JTextField txtPeso = new JTextField(); // Criação do campo de armazenamento de peso
	JTextField txtAltura = new JTextField(); // Criação do campo de armazenamento de altura
	JButton btnCalculaImc = new JButton("Calcular IMC"); // Criação do botão que calcula
	JButton btnSaiImc = new JButton("Sair"); // Criação do botão de saída

	// Formatações para cor e fonte
	Font fontTitle = new Font("SansSarif", Font.BOLD, 15);
	Color cor = new Color(0, 0, 255);

	// Classe Imc

	public Imc() {
		
		btnSaiImc.addActionListener(this);
		btnCalculaImc.addActionListener(this);

		setLayout(null); // Temos que desabilitar o layout padrão

		// JLabel, formatações do título
		lblCalcularImc.setBounds(150, 30, 130, 20); // Configura as posições e tamanhos da caixa do título
		add(lblCalcularImc); // Adiciona o componente

		// Formatações
		lblCalcularImc.setFont(fontTitle);
		lblCalcularImc.setForeground(cor);

		// JLabel, formatações do peso
		lblPeso.setBounds(85, 71, 100, 20); // Configura as posições e tamanhos do peso
		add(lblPeso); // Adiciona o componente

		// Formatações
		lblPeso.setFont(fontTitle);
		lblPeso.setForeground(cor);

		// JTextField, formatações para campo do peso
		txtPeso.setBounds(155, 74, 100, 20); // Configura o input da caixa do peso
		add(txtPeso); // Adiciona o componente

		// JLabel, formatações de altura
		lblAltura.setBounds(85, 121, 100, 20); // Configura as posições e tamanhos da altura
		add(lblAltura); // Adiciona o componente

		// Formatações
		lblAltura.setFont(fontTitle);
		lblAltura.setForeground(cor);

		// JTextField, formatações para campo da altura
		txtAltura.setBounds(155, 123, 100, 20); // Configura o input da caixa da altura
		add(txtAltura); // Adiciona o componente

		// JButton, formatações para o botão de calcular
		btnCalculaImc.setBounds(40, 190, 130, 20); // Configura as posições do botão
		add(btnCalculaImc); // Adiciona o componente

		// Formatações
		btnCalculaImc.setForeground(Color.blue);
		btnCalculaImc.setFont(fontTitle);

		// JButton, formatações para o botão de saída
		btnSaiImc.setBounds(210, 190, 130, 20); // Configura as posições do botão
		add(btnSaiImc); // Adiciona o componente

		// Formatações
		btnSaiImc.setForeground(Color.blue);
		btnSaiImc.setFont(fontTitle);

		// JFrame, formatações para a frame
		setTitle("Sistema de saúde"); // Título da Janela
		setSize(400, 300); // Tamanho da Janela (px)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Realmente fecha o programa
		setLocationRelativeTo(null); // Configura a posição
		setResizable(false); // Configurar o redirecionamento para falso
		//getContentPane().setBackground(Color.gray);
		setVisible(true); // Deixa a Janela visível
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