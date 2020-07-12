import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import redis.clients.jedis.Jedis;






public class Trabalho_JavaDb_Redis {
	public static void main(String[] args) { 
	      //Conectando no Redis server -  localhost 
	      Jedis jedis = new Jedis("localhost"); 
	      
	      /**
	       * antes de iniciar o programa pela primeira vez
	       * descomente o codigo abaixo apos rodar a primeira vez comentar novamente*/
	      // jedis.rpush("MSG:ID", "1");
	      /*opcao dois 
	       *  LPUSH "MSG:ID" "1"
	       *  execute o comando acima no redis-cliantes de rodar
	       *  a aplicaçao java
	       * */
	       
	      
	      /////////////////////////////////////////////////////////////
	      //exemplo de data e hora
	      	Calendar c = Calendar.getInstance();
	         
	        System.out.println("Data/Hora atual: "+c.getTime());
	        System.out.println("Ano: "+c.get(Calendar.YEAR));
	        System.out.println("Mês: "+c.get(Calendar.MONTH));
	        System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));
	        DateFormat hora = DateFormat.getTimeInstance();
	        Date data1 = c.getTime();
	        System.out.println("data1  "+data1);
	      
	       System.out.println("Hora formatada: "+hora.format(data1));
	       
	       
	       
	       
	       
	       
	       
	       
	    //  jedis.set("hora", hora.format(data1));
	      boolean conectado = false;
	      ////////////////////////////////////////////////////////////
	      Scanner ler = new Scanner(System.in);
	      System.out.println("Menu de Opçoes");
	      System.out.println("1: logar");
	      System.out.println("2: criar novo usuario");
	      System.out.println("0: sair");
	      String usuario="";
	      int escolha =ler.nextInt();ler.nextLine();
	      while(escolha!=0) {
		      if(escolha == 1) {
		    	  System.out.println("DIgite usuario/apelido: ");
		    	  usuario = ler.nextLine();
		    	  System.out.println("Digite senha:");
		    	  String password = ler.nextLine();
		    	  if(usuario.equals(jedis.hget("user:"+usuario,"APELIDO"))&&password.equals(jedis.hget("user:"+usuario,"SENHA"))) {
		    		System.out.println("liberado o acesso");  
		    		conectado = true;
		    		break;
		    	  }else {
		    		  System.out.println("erro de login usuaro/senha incorretos");
		    	  }  		   
		    	  System.out.println("Menu de Opçoes");
			      System.out.println("1: logar");
			      System.out.println("2: criar novo usuario");
			      System.out.println("0: sair");
			      escolha =ler.nextInt();ler.nextLine();
		    }
	      	if(escolha == 2) {
		    	  System.out.println("Digite o apelido do usuario: ");
		    	  String apelido =ler.nextLine();
		    	  if(jedis.sadd("APELIDOS",apelido)==0) {
		    		  System.out.println("Erro este user name ja esta em uso");
		    		 
		    	  	}else {
		    		  System.out.println("Digite o nome do usuario");
			    	  String nome = ler.nextLine();
			    	  System.out.println("Digite uma senha para o usuario");
			    	  String senha = ler.next();ler.nextLine();
			    	  String data = hora.format(data1);
			    	  jedis.hset("user:"+apelido,"APELIDO",apelido);
			    	  jedis.hset("user:"+apelido,"NOME",nome);
			    	  jedis.hset("user:"+apelido,"SENHA",senha);			    	  
			    	  jedis.hset("user:"+apelido,"DATA",data);
			    	  jedis.save();
		    	  }
		    	  
		    	  System.out.println("Menu de Opçoes");
			      System.out.println("1: logar");
			      System.out.println("2: criar novo usuario");
			      System.out.println("0: sair");
			      escolha =ler.nextInt();ler.nextLine();
		      }else {
		    	  System.out.println("erro valor invalido");
		    	  System.out.println("Menu de Opçoes");
			      System.out.println("1: logar");
			      System.out.println("2: criar novo usuario");
			      System.out.println("0: sair");
			      escolha =ler.nextInt();ler.nextLine();
		      }
	      	
	      }//finm while
	      
	      
	      
	      
	     
	      System.out.println("usuario "+usuario +" conectado!: ");
	      
	     
	      while(conectado==true) {
	    	  System.out.println("Menu mensagens");
	    	  System.out.println("1: escrever nova mensagem");
	    	  System.out.println("2: responder");
	    	  System.out.println("3: Mostrar respostas por id da mensagem");
	    	  System.out.println("4: Mostrar suas mensagens");
	    	  int s = ler.nextInt();ler.nextLine();
	    	  if (s==1) {
	    		  List<String> mensagemid= jedis.lrange("MSG:ID", 0, -1);
	    		 int ID=0;
	    		  for (String id : mensagemid) {
					int d = Integer.parseInt(id);
					ID=d+1;
				}
	    		  
	    		  System.out.println("Digite o texto da mensagem: ");
	    		  String mensagem = ler.nextLine();	  
	    		  System.out.println("para quantas pessoas deseja mandar a mensgem?");
	    		  int qntd = ler.nextInt();ler.nextLine();
	    		  String enviada =data1.toString();
	    		  String lista[] = new String[qntd];
	    		  for (int i = 0; i < lista.length; i++) {
					System.out.println("digite o "+(i+1)+"º destinatario");
					lista[i]= ler.nextLine();
	    		  }
	    		  jedis.hset("MSG:"+ID, "ID", Integer.toString(ID));
	    		  jedis.hset("MSG:"+ID, "REMETENTE", usuario);
	    		  jedis.hset("MSG:"+ID, "DATA", enviada);
	    		  jedis.hset("MSG:"+ID, "TEXTO", mensagem);
	    		  
	    		 
	    		  for (int i = 0; i < lista.length; i++) {
					System.out.println("destinatario = "+lista[i]+": "+(i+1));
					jedis.hset("MSG:"+ID, "DESTINATARIO:"+(i+1), lista[i]);
					jedis.sadd("DESTINATARIO:MSG:"+ID,lista[i]);
					jedis.rpush("MENSAGEM:USR:"+lista[i], mensagem);
					
					
				}
	    		  
	    		  System.out.println("1: escrever nova mensagem");
		    	  System.out.println("2: responder");
		    	  System.out.println("3: Mostrar respostas por id da mensagem");
		    	  System.out.println("4: Mostrar suas mensagens");
		    	  s = ler.nextInt();
	    	  }
	    	  if(s==2) {
	    		  System.out.println("responder mensagens");
	    		  System.out.println("qual o id da mensagem que voce esta respondendo?");
	    		  String resp = ler.nextLine();
	    		  List<String> mensagemid= jedis.lrange("MSG:ID", 0, -1);
		    		 int ID=0;
		    		  for (String id : mensagemid) {
						int d = Integer.parseInt(id);
						ID=d+1;
					}
	    		  
	    		  System.out.println("Digite o texto da mensagem: ");
	    		  String mensagem = ler.nextLine();
	    		  
	    		  System.out.println("para quantas pessoas deseja mandar a mensagem?");
	    		  int qntd = ler.nextInt();ler.nextLine();
	    		  String enviada =data1.toString();
	    		  String lista[] = new String[qntd];
	    		  for (int i = 0; i < lista.length; i++) {
					System.out.println("digite o "+(i+1)+"º destinatario");
					lista[i]= ler.nextLine();
	    		  }
	    		  jedis.hset("MSG:"+ID, "ID", Integer.toString(ID));
	    		  jedis.hset("MSG:"+ID, "REMETENTE", usuario);
	    		  jedis.hset("MSG:"+ID, "DATA", enviada);
	    		  jedis.hset("MSG:"+ID, "TEXTO", mensagem);
	    		  
	    		  //aqui seria interressante validar se cada destinatario existe no banco 
	    		  for (int i = 0; i < lista.length; i++) {
					System.out.println("mensagem/s enviadas ao destinatario = "+lista[i]+": "+(i+1));
					jedis.hset("MSG:"+ID, "DESTINATARIO:"+(i+1), lista[i]);
					jedis.sadd("DESTINATARIO:MSG:"+ID,lista[i]);
	    		  }
	    		  Set<String> posicao= jedis.zrange("RESPOSTA:"+"MSG:"+resp, 0, -1);
	    		  int pos= posicao.size();
	    		  
	    		  jedis.zadd("RESPOSTA:"+"MSG:"+resp, pos+1, mensagem);
	    		  
	    		
	    		  System.out.println("1: escrever nova mensagem");
		    	  System.out.println("2: responder");
		    	  System.out.println("3: Mostrar respostas por id da mensagem");
		    	  System.out.println("4: Mostrar suas mensagens");
		    	  s = ler.nextInt();
	    	  }
	    	  if (s==3) {
	    		  System.out.println("digite o id da mensagem que deseja ver as respostas");
	    		  int idresp = ler.nextInt();
	    		  Set<String> lista2 =jedis.zrange("RESPOSTA:"+"MSG:"+idresp, 0, -1);
	    		  int cont =1;
	     		  for (String item : lista2) {
	     			  
	     			  System.out.println(cont+"º resposta: "+item);
	     			  cont++;
	    			}
	     		  System.out.println(" ");
	     		  System.out.println("1: escrever nova mensagem");
		    	  System.out.println("2: responder");
		    	  System.out.println("3: Mostrar respostas por id da mensagem");
		    	  System.out.println("4: Mostrar suas mensagens");
		    	  s = ler.nextInt();
	    	  
	    	  }
	    	  if (s==4) {
	    		  List<String> lista3 =jedis.lrange("MENSAGEM:USR:"+usuario, 0, -1);
	    		  int cont =1;
	     		  for (String item : lista3) {
	     			  
	     			  System.out.println(cont+"º resposta: "+item);
	     			  cont++;
	    			}
	    	  }
	    	  
	      }
	      	
	}
	      
	}
	      
	
	
 

