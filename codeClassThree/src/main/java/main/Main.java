package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    var a = new Aluno(1001,"Super Mario","222.333.444-55");
    a.info();

    var aula = new Horario();
    //aula.setHora(40);
    aula.setHora(19);

    //ArrayList<String> pessoas = new ArrayList();
    var pessoas = new LinkedList<String>();

    pessoas.add("Mario");
    pessoas.add("Luigi");
    pessoas.add("Peach");
    pessoas.add("Yoshi");

    //System.out.println(pessoas.get(0));
    //pessoas.remove(1);

    System.out.println("Ordem alfab�tica");
    System.out.println(pessoas);

    System.out.println("Ordem alfab�tica");
    Collections.sort(pessoas);
    System.out.println(pessoas);


    System.out.println("Ordem shuffle");
    Collections.shuffle(pessoas);
    System.out.println(pessoas);


    System.out.println(Collections.min(pessoas));
    System.out.println(Collections.max(pessoas));


    var capitais = new HashMap<String, String>();

    capitais.put("Brasil","Brasilia");
    capitais.put("Argentina","Buenos Aires");
    capitais.put("Paraguai","Assun��o");
    capitais.put("Uruguai","Montevid�u");

    System.out.println(capitais);
    System.out.println(capitais.get("Uruguai"));


    var lista = new ArrayList<Integer>();
    var conjunto = new HashSet<Integer>();
    var mapa = new HashMap<String, Integer>();

    int soma;
    soma=0;
    for (int i = 0; i < lista.size(); i++) {
      soma+=lista.get(i);
    }

    soma =0;

    for(int item : lista) {
      soma+=item;
    }

    soma=0;

    //Iterator it = lista.mapa.entrySet().iterator();
    //Iterator it = conjunto.iterator();
    var it = lista.iterator();

    while(it.hasNext()) {
      soma +=(int)it.next();
    }

    var dataHoje = LocalDate.now();

    System.out.println(dataHoje);

    var formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");
    System.out.println(dataHoje.format(formatador));

  }
}
