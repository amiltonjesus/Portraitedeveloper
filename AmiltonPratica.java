/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amiltonpratica;

import java.util.Scanner;

/**
 *
 * @author HaudalioJJP
 */
public class AmiltonPratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner tec = new Scanner(System.in);
        int a, b;
        int c, d;
        int e, f;
        int g, h, j;
        String[] opcoes = new String[8];
        System.out.println("1.Consulta");
        System.out.println("2.Recarga");
        System.out.println("3.Pagamento");
        System.out.println("4.Transferencia");
        System.out.println("5.pre-pago");
        System.out.println("6.Compra");
        System.out.println("7.Levantamento");
        System.out.println("8.Servicos");
        System.out.println("9.Sojogo");
        System.out.println("10.Donativo INGC - Ciclone IDAI");
        a = tec.nextInt();
        switch(a){
            case 1:
                if(a==1){

                    System.out.println("1.Saldo de Conta");
                    System.out.println("2.Movimentos");
                    System.out.println("3.Limite anual");
                    
                    b = tec.nextInt();
                    switch(b){
                        case 1:
                            if(b==1){
                                System.out.println("Consulta Saldo ");
                              System.out.println("de Conta Movel/BCI");
                           System.out.println(" (pode ter custos associados)");
                                System.out.println("Digite seu PIN:");
                              
                            }
                        
                            break;
                            case 2:
                                if(b==2){
                                    System.out.println("Consulta Movimentos");
                                    System.out.println("de Conta Movel/BCI");
                                    System.out.println("(pode ter custos associados)");
                                    System.out.println("Digite seu PIN:");

                                    
                                }
                                break;
                            case 3:
                                if(b==3){
                                    System.out.println("nullDigite seu PIN:");
                                }
                            
                    }
                }
                break;
                case 2:
                    if(a==2){
                     
                        System.out.println("1. Tmcel");
                        System.out.println("2. Vodacom");
                        System.out.println("3. Movitel");
                        System.out.println("4. Credelec");
                        System.out.println("5. Teledata");
                        System.out.println("6. Zap");
                        System.out.println("7. Mozik");
                        
                        b = tec.nextInt();
                    switch(b){
                        case 1:
                            if(b==1){
                                System.out.println("1. Giga 30");
                              System.out.println("2. Giro 50");
                              System.out.println("3. Giga 80");
                              System.out.println("4. Giro 100");
                                System.out.println("5. Giga 150");
                                  System.out.println("6. Giro 300");
                                    System.out.println("7. Giro 600");
                                      System.out.println("8. Segunda vai");
                            }
                            break;
                            case 2:
                                if(b==2){
                                    System.out.println("1. Recarga 50");
                                    System.out.println("2. Reacarga 100");
                                    System.out.println("3. Recarga 200");
                                    System.out.println("4. Recarga 500");
                                    System.out.println("5. Segunda via");
                                }
                                break;
                            case 3:
                                if(b==3){
                                    System.out.println("1. 10 MT");
                                    System.out.println("2. 20 MT");
                                    System.out.println("3. 50 MT");
                                    System.out.println("4. 100 MT");
                                    System.out.println("5. 200 MT");
                                    System.out.println("6. 500 MT");
                                    System.out.println("7. Segunda via");
                                }
                                break;
                            case 4:
                                if(b==4){
                                    System.out.println("Numero do contador");
                                    System.out.println("(apenas credelec online)");
                                }
                                break;
                            case 5:
                                if(b==5){
                                    System.out.println("Servico Indisponivel. Nao foi possivel");
                                    System.out.println("processar seu pedido.");
                                }
                                break;
                            case 6:
                                if(b==6){
                                   System.out.println("1. 715MT - MINI");
                                   System.out.println("2. 1090MT - MINI+");
                                   System.out.println("3. 1530MT - MAX");
                                   System.out.println("4. 3825MT - PREMIUM");
                                }
                                break;
                            case 7:
                                if(b==7){
                                    System.out.println("1. Subscricao Mensal - 90MT");
                                }
                               
                            }
                         
                    }
                          
                  
                        break;
                        case 3:
                            if(a==3){
                                System.out.println("1. Multichoice");
                                System.out.println("2. Agua/Energia");
                                System.out.println("3. Tel/TV/Internet");
                                System.out.println("4. Propinas");
                                System.out.println("5. Jornais");
                                System.out.println("6. Seguros");
                                System.out.println("7. Transporte");
                                System.out.println("8. Outros");
                                
                                      b = tec.nextInt();
                    switch(b){
                        case 1:
                            if(b==1){
                            System.out.println("1. DStv");
                            System.out.println("2. GOtv");
                            System.out.println("3. BoxOffice");
                            System.out.println("4. Agente");
                            }
                                break;
                        case 2:
                            if(b==2){
                                System.out.println("1. ADEM/FIPAG");
                                System.out.println("2. Factura EDM");
                            }
                            break;
                        case 3:
                            if(b==3){
                            System.out.println("1. TDM");
                            System.out.println("2. TVCabo");
                            System.out.println("3. Vodacom");
                            System.out.println("4. Teledata");
                            System.out.println("5. Movitel");
                      
                            }
                            break;
                        case 4:
                            if(b==4){
                                System.out.println("1. ISPU");
                                System.out.println("2. UEM");
                                System.out.println("3. ISCTEM");
                                System.out.println("4. ISTEG");
                                System.out.println("5. UP");
                                System.out.println("6. IEG/SDG");
                                System.out.println("7. Arco Iris");
                              System.out.println("8. USTM");
                                System.out.println("9. ISUTC/ITC");
                                  System.out.println("10. ISCIM");
                                    System.out.println("11. IPCI");
                                      System.out.println("12. IQRA");
                                        System.out.println("13. ECSFA");
                                  
                            }
                            }
                            }
                            break;
                            case 4:
                                if(a==4){
                                    System.out.println("1. Para telemovel");
                                    System.out.println("2. Para cartao");
                                }
                                break;
                                case 5:
                                    if(a==5){
                                        System.out.println("Carregamento pre-pago");
                                          System.out.println("1. BRITAM");
                                          System.out.println("2. Mambas");
                                          System.out.println ("3. Swakuda") ; 
                                          System.out.println("4. EPM");          
                                         System.out.println ("5. ABMZ Prepago");
                                         System.out.println ("6. Nedback Certo") ;         
                                        System.out.println("7. ESDA") ;           
                                       System.out.println("8. Serv. Gasol.");
                                       System.out.println("9. Tako Pago");
                                       System.out.println("10. Txova");
                                       System.out.println("11. PUMA");
                                       System.out.println("12. GALP");
                                       System.out.println("13. Petromoc");
                                      System.out.println("14. TAP");
                                       System.out.println ("15.") ;       
                                    }
                                   break;
                                case 6:
                                    if(a==6){
                                        System.out.println("Compra");
                                        System.out.println("Codigo do Comerciante");
                                    }
                                    break;
                                    case 7:
                                        if(a==7){
                                            System.out.println("Solicitar codigo de autenticacao");
                                            System.out.println("para um levantamento usando a");
                                            System.out.println("conta-movel?");
                                            System.out.println("1. SIM");
                                            System.out.println("0. NAO");
                                        }
                                        break;
                                        case 8:
                                            if(a==8){
                                                System.out.println("1. Linha cliente");
                                                System.out.println("2. Alterar PIN movel");
                                            }
                                            break;
                                            case 9:
                                                if(a==9){
                                                    System.out.println("1. Totoloto");
                                                    System.out.println("2. Lotaria");
                                                    System.out.println("3. Carregar conta online");
                                                    System.out.println(" SOJOGO.CO.MZ");
                                                }
                                                break;
                                                case 10:
                                                    if(a==10){
                                                        System.out.println("Indique o montante:");
                                                    }
                                                    
    }
    }
    
}
