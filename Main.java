class FileReaderClass {
    public void readFile(String filename) {
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please make sure the file exists and try again.");
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

public class FileReaderApp {
    public static void main(String[] args) {
        FileReaderClass fileReader = new FileReaderClass();
        String filename = "example.txt"; // Change this to your file name
        
        System.out.println("Reading data from file...");
        fileReader.readFile(filename);
    }
}
