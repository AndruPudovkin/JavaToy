package Service;

import Model.EntertainmentToy;
import Model.PlotFormationToy;
import Model.SportToy;
import Model.Toy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public List<Toy> toyListFile;
    public FileService(){
        this.toyListFile = new ArrayList<>();
    }
    public List<Toy> readFileToy(String nameFile){
        List<Toy> list = new ArrayList<>();
        try(FileReader fileReader = new FileReader(nameFile)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrayLine = line.split("-");
                if (arrayLine[0].equals("SportToy")) {
                    SportToy sportToy = new SportToy(Integer.parseInt(arrayLine[2]), arrayLine[4], Integer.parseInt(arrayLine[6]), arrayLine[8]);
                    list.add(sportToy);
                }
                if (arrayLine[0].equals("PlotFormation")) {
                    PlotFormationToy plotFormationToy = new PlotFormationToy(Integer.parseInt(arrayLine[2]), arrayLine[4], Integer.parseInt(arrayLine[6]), arrayLine[8]);
                    list.add(plotFormationToy);
                }
                if (arrayLine[0].equals("EntertainmentToy")){
                    EntertainmentToy entertainmentToy = new EntertainmentToy(Integer.parseInt(arrayLine[2]), arrayLine[4], Integer.parseInt(arrayLine[6]));
                    list.add(entertainmentToy);
                }

            }
        }catch (IOException e){

        }
        return list;
    }
    public void writeFileToy(String nameFile, List<Toy> toyList){
        try(FileWriter fileWriter = new FileWriter(nameFile,true)) {
            for (Toy toy:toyList) {
                fileWriter.write(toy.toString()+"\n");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    public List<Toy> getAllToy() {
        List<Toy> studentList = new ArrayList<>();
        for (Toy toy : toyListFile) {
            studentList.add(toy);
        }
        return studentList;
    }
}
