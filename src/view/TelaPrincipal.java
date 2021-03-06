package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panelCabecalho, BorderLayout.NORTH);
		GridBagLayout gbl_panelCabecalho = new GridBagLayout();
		gbl_panelCabecalho.columnWidths = new int[]{0, 0};
		gbl_panelCabecalho.rowHeights = new int[]{85};
		gbl_panelCabecalho.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelCabecalho.rowWeights = new double[]{0.0};
		panelCabecalho.setLayout(gbl_panelCabecalho);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00E1lculo de M\u00E9dias");
		lblNewLabel_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/image/aluna.png")));
		lblNewLabel_1.setIconTextGap(20);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panelCabecalho.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JPanel panelFundo = new JPanel();
		contentPane.add(panelFundo, BorderLayout.CENTER);
		panelFundo.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCabecalhoFundo = new JPanel();
		panelFundo.add(panelCabecalhoFundo, BorderLayout.NORTH);
		GridBagLayout gbl_panelCabecalhoFundo = new GridBagLayout();
		gbl_panelCabecalhoFundo.columnWidths = new int[]{378, 0};
		gbl_panelCabecalhoFundo.rowHeights = new int[]{81, 0};
		gbl_panelCabecalhoFundo.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelCabecalhoFundo.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelCabecalhoFundo.setLayout(gbl_panelCabecalhoFundo);
		
		JLabel lblNewLabel = new JLabel("Qual m\u00E9dia voc\u00EA quer calcular?");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panelCabecalhoFundo.add(lblNewLabel, gbc_lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JPanel panelEscolhasFundo = new JPanel();
		panelFundo.add(panelEscolhasFundo, BorderLayout.CENTER);
		GridBagLayout gbl_panelEscolhasFundo = new GridBagLayout();
		gbl_panelEscolhasFundo.columnWidths = new int[]{214, 0, 0, 0};
		gbl_panelEscolhasFundo.rowHeights = new int[]{96, 0};
		gbl_panelEscolhasFundo.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelEscolhasFundo.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelEscolhasFundo.setLayout(gbl_panelEscolhasFundo);
		
		JButton btnMediaAritmetica = new JButton("<html><h1>M??dia<br>Aritm??tica</h1></html>");
		btnMediaAritmetica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculaMediaAritmetica();				
			}
		});
		btnMediaAritmetica.setBackground(new Color(144, 238, 144));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panelEscolhasFundo.add(btnMediaAritmetica, gbc_btnNewButton);
		
		JButton btnMediaPonderada = new JButton("<html><h1>M??dia<br>Ponderada</h1></html>");
		btnMediaPonderada.setBackground(new Color(144, 238, 144));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 0;
		panelEscolhasFundo.add(btnMediaPonderada, gbc_btnNewButton_1);
		
		JButton btnMediaHarmonica = new JButton("<html><h1>M??dia<br>Harm??nica</h1></html>");
		btnMediaHarmonica.setBackground(new Color(144, 238, 144));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 0;
		panelEscolhasFundo.add(btnMediaHarmonica, gbc_btnNewButton_2);
	}
	
	public void calculaMediaAritmetica() {
		
		try {
			String quantidadeNotas = JOptionPane.showInputDialog("Digite o n??mero de notas totais do aluno");
			int quantidadeNotasConvertido = Integer.parseInt(quantidadeNotas);
			
			double[] notas = new double[quantidadeNotasConvertido];
			double somaNotas = 0;
			
			for (int i = 0; i < notas.length; i++) {
				String nota = JOptionPane.showInputDialog("Digite a nota " +(i+1), DISPOSE_ON_CLOSE);
				double notaConvertida = Double.parseDouble(nota);
				notas[i] =  notaConvertida;
				somaNotas += notaConvertida;
			}
			
			System.out.println(Arrays.toString(notas));
			System.out.println(somaNotas);
			
			double mediaNotas = somaNotas/notas.length;
			
			DecimalFormat formatarNumero = new DecimalFormat();
			formatarNumero.setMaximumFractionDigits(2);
			
			JOptionPane.showMessageDialog(contentPane, "A m??dia do aluno ??: "+formatarNumero.format(mediaNotas), "Resultado", JOptionPane.PLAIN_MESSAGE);
			
			System.out.println(mediaNotas);
			
		} catch (NumberFormatException | NullPointerException e) {
			JOptionPane.showMessageDialog(contentPane, "Por favor, digite um n??mero v??lido", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

}
