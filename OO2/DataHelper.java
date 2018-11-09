import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
    
  public class DataHelper {       
    private GregorianCalendar gc;  // irá realizar a maior parte das tarefas na manipulação das datas
    private Date dataParaManipular; // responsável por "injetar/auxiliar" na variável gc 
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); // transforma string para Date e vice-versa
    
    public DataHelper(Date data){ // construtor que recebe um Date e inicializa gc
        this.gc = new GregorianCalendar();
        this.gc.setTime(data);
        this.dataParaManipular = data;
    }
    
    public DataHelper(String data){ // construtor que recebe uma string no formato definido acima
        try {
        this.gc = new GregorianCalendar();
        this.gc.setTime(formatter.parse(data)); // transforma a string em Date e atribui para gc
        } catch (ParseException e) { // o formatter pode lançar uma exceção, por isso o bloco try catch
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void adicionarDias(int quantidade){
        adicionar(quantidade, Calendar.DAY_OF_MONTH);
    }
    
    public void adicionarMeses(int quantidade){
        adicionar(quantidade, Calendar.MONTH);
    }
    
    public void adicionarAnos(int quantidade){
        adicionar(quantidade, Calendar.YEAR);
    }
                
    private void adicionar(int quantidade, int tipoCampo){ //possui a lógica para manipular o calendário
        gc.add(tipoCampo, quantidade); // é utilizada pelos métodos acima
        dataParaManipular = gc.getTime();
    }        
    
    public int getMinutos(){
        return getCampo(Calendar.MINUTE);
    }
    
    public int getHoras(){
        return getCampo(Calendar.HOUR);
    }
    
    private int getCampo(int tipoCampo){
        return gc.get(tipoCampo);
    }
    
    public Integer comparar(String data){
        try {
                return comparar(formatter.parse(data));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }        
    
    public int comparar(Date data){ // retorna 0 se datas forem iguais
        Calendar c = new GregorianCalendar(); // menor que 0 se a data do Calendar for menor
        c.setTime(data); // maior que 0 se a data do Calendar for maior
        return gc.compareTo(c);
    }        
    
    public String getAsString(){
        return formatter.format(dataParaManipular);
    }  

    public Date getData(){
        return this.dataParaManipular;
    }       
}