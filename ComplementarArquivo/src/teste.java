// Java program to merge two
// files  into third file alternatively

import java.io.*;

public class teste
{
    public static void main(String[] args) throws IOException
    {

        PrintWriter pw = new PrintWriter("C:/Users/rodrigo.camargos/IdeaProjects/ExercicioAula15/Juncao.txt");


        BufferedReader br1 = new BufferedReader(new FileReader("C:/Users/rodrigo.camargos/IdeaProjects/ExercicioAula15/Nome.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("C:/Users/rodrigo.camargos/IdeaProjects/ExercicioAula15/Sobrenome.txt"));


        String line1 = br1.readLine();
        String line2 = br2.readLine();


        while (line1 != null || line2 !=null)
        {
            if(line1 != null)
            {
                pw.print(line1 + " ");
                line1 = br1.readLine();
            }

            if(line2 != null)
            {
                pw.println(line2);
                line2 = br2.readLine();
            }
        }

        pw.flush();


        br1.close();
        br2.close();
        pw.close();

        System.out.println("Junção dos arquivos realizada com sucesso");
    }
}