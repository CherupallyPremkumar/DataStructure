package Arrays;




import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputStreams {
    public static void ByteAttayOutput(File f) throws FileNotFoundException
    {
        byte[] b = new byte[(int) f.length()];
      //  File f = new File("C:\\Users\\Cherupally Premkumar\\Desktop\\datastructure\\DataStructure\\Datastructure\\src\\Sample.txt");
        InputStream inputStream = new FileInputStream(f);
        ByteArrayOutputStream byteArrayOutputStream
                = new ByteArrayOutputStream();
        try {
            int temp;
            while((temp=inputStream.read(b))!=-1)
            {
                byteArrayOutputStream.write(b,0,temp);
            }

            //  b = inputStream.readAllBytes();
        } catch (IOException e) {
            System.out.println(e);
        }

        for (byte c : byteArrayOutputStream.toByteArray()) {
            System.out.print((char) c);
        }
    }
    public static void ByteStream(File f) throws IOException {
        byte[] by=new byte[(int) f.length()];
        InputStream inputStream=null;
        try {
             inputStream = new FileInputStream(f);
           inputStream.read(by);
        }catch (FileNotFoundException e)
        {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            inputStream.close();
        }
        for (byte c :by) {
            System.out.print((char) c);
        }
    }
    public static void readAllBytess(URI f)
    {
        Path p= Paths.get(f.getPath());
          byte[] arr=null;
        try {
            arr=Files.readAllBytes(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void ByteToString(File f)
    {
        byte[] bytes = new byte[(int) f.length()];
        InputStream inputStream=null;
        try {
             inputStream=new FileInputStream(f);
             bytes=inputStream.readAllBytes();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s=new String(bytes, StandardCharsets.UTF_8);
        System.out.println(s);

    }
    public static void ListToArray(List<Integer> list)
    {
        int[] arr=list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    public static void subsets(int[] nums)
    {
        List<List<Integer>> output =new ArrayList<>();
        int n=nums.length;
        for (int i = (int) Math.pow(2,n);i<(int)Math.pow(2,n+1);i++)
        {
            String bitmask=Integer.toBinaryString(i).substring(1);
        }
    }



    public static void main(String[] args) throws Exception {

        File f = new File("C:\\Users\\Cherupally Premkumar\\Desktop\\datastructure\\DataStructure\\Datastructure\\src\\Sample.txt");
        //InputStreams.ByteStream(f);
        //InputStreams.readAllBytess(new URI("Datastructure/src/Sample.txt"));
        InputStreams.ByteToString(f);

}
}

