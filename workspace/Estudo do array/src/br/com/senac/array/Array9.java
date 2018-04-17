/**
 * 
 */
package br.com.senac.array;

/**
 * @author jose.afilho3 estudo do array - exemplo prático de uso do array
 *         multidimensional
 */

public class Array9 {

	public static void main(String[] args) {
		String[][] agenda = { { "José de Assis", "1111-1111", "ze@gmail.com" },
				{ "Bill Gates", "2222-2222", "bill@outlook.com" }, { "Linus Torvalds", "3333-3333", "linus@tux.com" } };
		// recuperando o email do Bill Gates
		// System.out.println(agenda[1][2]);
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("------------------------------");
			for (int j = 0; j < agenda[i].length; j++) {
				System.out.println(agenda[i][j]);
			}
		}

	}

}
