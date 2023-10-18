package com.projeto;

import java.util.Scanner;

import com.destino.model.Destino;
import com.projeto.dao.ClienteDAO;
import com.projeto.dao.DestinoDAO;
import com.projeto.database.DatabaseConnection;
import com.projeto.model.Cliente;

public class Main {

	public static void main(String[] args) {
		
		
	var connection = DatabaseConnection.createConnection();
	
	ClienteDAO clienteDAO = new ClienteDAO(connection);
	
	DestinoDAO destinoDAO = new DestinoDAO(connection);

    try (Scanner scanner = new Scanner(System.in)) {
        var option = 0;

        do {

            System.out.println("Escolha uma opção de 1 - 5\n"
                    + "1 - Create\n"
                    + "2 - Read\n"
                    + "3 - Update\n"
                    + "4 - Delete\n"
                    + "5 - Sair\n");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    scanner.nextLine();
                    Destino destino = new Destino();

                    System.out.println("Valor Promocional:  ");
                    destino.setValorPromocionalDestino(scanner.nextDouble());
                    System.out.println("Promoções:  ");
                    destino.setPromocoesDestino(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Nome do Destino:  ");
                    destino.setNomeDestino(scanner.nextLine().trim());
                    System.out.println("Valor do Destino:  ");
                    destino.setValorDestino(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.println("Foto:  ");
                    destino.setFoto(scanner.nextLine().trim());
                    System.out.println("Descrição:  ");
                    destino.setDescricao(scanner.nextLine().trim());

                    destinoDAO.createDestino(destino);

                    break;

                case 2:
                    destinoDAO.readAllDestinos();
                    break;

                case 3:

                    Destino destinoAtualizado = new Destino();
                    System.out.println("Digite o ID do destino a ser atualizado: ");
                    destinoAtualizado.setIdDestino(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Valor Promocional:  ");
                    destinoAtualizado.setValorPromocionalDestino(scanner.nextDouble());
                    System.out.println("Promoções:  ");
                    destinoAtualizado.setPromocoesDestino(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Nome do Destino:  ");
                    destinoAtualizado.setNomeDestino(scanner.nextLine().trim());
                    System.out.println("Valor do Destino:  ");
                    destinoAtualizado.setValorDestino(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.println("Foto:  ");
                    destinoAtualizado.setFoto(scanner.nextLine().trim());
                    System.out.println("Descrição:  ");
                    destinoAtualizado.setDescricao(scanner.nextLine().trim());

                    destinoDAO.updateDestino(destinoAtualizado);
                    break;

                case 4:
                    System.out.println("Digite o ID do Destino a ser DELETADO: ");
                    int idDestino = scanner.nextInt();
                    destinoDAO.deleteDestino(idDestino);

                default:
                    break;
            }

        } while (option != 5);
    }

}

}
	
	
//	try (Scanner scanner = new Scanner (System.in)) {
//		var option = 0;
//		
//		do {
//			
//			
//			System.out.println("Escolha uma opção de 1 - 5\n"
//					+"1 - Create\n"
//					+"2 - Read\n"
//					+"3 - Update\n"
//					+"4 - Delete\n"
//					+"5 - Sair\n");
//			option = scanner.nextInt();
//			
//			
//			switch (option) {
//			case 1:
//				scanner.nextLine();
//				Cliente cliente = new Cliente();
//			
//					
//				
//				System.out.println("Nome Completo:  ");
//				cliente.setNomeCliente(scanner.nextLine().trim());
//				System.out.println("CPF:  ");
//				cliente.setCpfCliente(scanner.nextLine().trim());
//				System.out.println("Endereco:  ");
//				cliente.setEnderecoCliente(scanner.nextLine().trim());
//				System.out.println("Telefone:  ");
//				cliente.setTelefoneCliente(scanner.nextLine().trim());
//				System.out.println("Email:  ");
//				cliente.setEmailCliente(scanner.nextLine().trim());
//				System.out.println("Senha:  ");
//				cliente.setSenhaCliente(scanner.nextLine().trim());
//				
//				clienteDAO.createClient(cliente);
//				
//				break;
//				
//			case 2:
//				clienteDAO.readAllClients();
//				break;
//			
//			case 3:
//				
//				Cliente clienteAtualizado = new Cliente ();
//				System.out.println("Digite o ID do cliente a ser atualizado: ");
//				clienteAtualizado.setIdCliente(scanner.nextInt());
//				scanner.nextLine();
//				System.out.println("Nome Completo:  ");
//				clienteAtualizado.setNomeCliente(scanner.nextLine().trim());
//				System.out.println("CPF:  ");
//				clienteAtualizado.setCpfCliente(scanner.nextLine().trim());
//				System.out.println("Endereco:  ");
//				clienteAtualizado.setEnderecoCliente(scanner.nextLine().trim());
//				System.out.println("Telefone:  ");
//				clienteAtualizado.setTelefoneCliente(scanner.nextLine().trim());
//				System.out.println("Email:  ");
//				clienteAtualizado.setEmailCliente(scanner.nextLine().trim());
//				System.out.println("Senha:  ");
//				clienteAtualizado.setSenhaCliente(scanner.nextLine().trim());
//				
//				clienteDAO.updateClient(clienteAtualizado);
//				break;
//				
//			case 4:
//				System.out.println("Digite o ID do Cliente a ser" + " DELETADO");
//				int idCliente = scanner.nextInt();
//				clienteDAO.deleteClient(idCliente);
//				
//			default:
//				break;
//			}
//			
//			
//			
//		} while (option != 5);
//	} 
//
//	}
//	
//	
//
//}
