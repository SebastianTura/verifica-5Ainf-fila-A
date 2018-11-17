
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Verifica in laboratorio");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(9,16);
		StringBuilder sb=new StringBuilder();
		sb.append("<html>");
		
		sb.append("<h1>SSH First Aid</h1>");
		sb.append("<div style='display:table'>");
		sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("<h1>Alias</h1>");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("<h1>Hostname</h1>");
		sb.append("</div>");	
		
		sb.append("<div style='display:table-cell'>");
		sb.append("<h1>Raspberry</h1>");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("<h1>server.marconi.it</h1>");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("<h1>CoreSwitch</h1>");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("<h1>10.0.100.1</h1>");
		sb.append("</div>");
		
		sb.append("</div>");
		sb.append("</div>");
		sb.append("</html>");
		
		String lbl = sb.toString();
		
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		
		// TODO Creare la stringa HTML per il wireframe
		
		// TODO Convertire lo StringBuilder in String
		
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(lbl));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

