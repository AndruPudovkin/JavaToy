package Controller;

import Model.*;
import Service.FileService;
import Service.ToyService;
import View.ToyView;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ControllerToy {
    private final FileService fileService =new FileService();
    private final ToyService toyService = new ToyService();
    private final ToyView toyView = new ToyView();

    public void createToy(Type type,  String name, int cost, String x ){
        toyService.create(type, name, cost, x);
    }

    public Toy getToy(Type type){
        SportToy sportToy = new SportToy(1, "1", 1);
        PlotFormationToy plotFormationToy = new PlotFormationToy(1, "1", 1);
        EntertainmentToy entertainmentToy = new EntertainmentToy(1, "1", 1);

        List<Toy> toyList = toyService.getAllToy();
        for (Toy toy: toyList){
            if (type == Type.SPORTTOY){
                sportToy.setId(toy.getId());
                sportToy.setName(toy.getName());
                sportToy.setCost(toy.getCost());
                sportToy.setSport("Ведите категорию спорта");
            }
            if (type == Type.PLOTFORMATIONTOY){
                plotFormationToy.setId(toy.getId());
                plotFormationToy.setName(toy.getName());
                plotFormationToy.setCost(toy.getCost());
                plotFormationToy.setPlot("Ведите категорию ");

            }
            if (type == Type.ENTERTAINMENTTOY){
                entertainmentToy.setId(toy.getId());
                entertainmentToy.setName(toy.getName());
                entertainmentToy.setCost(toy.getCost());
            }
        }

        return entertainmentToy;
    }
    public void printToy(){
        List<Toy> toyList = toyService.getAllToy();
        for (Toy toy: toyList){
            toyView.printOnConsole(toy);
        }
    }

    public void winToyController(String fileName, String fileNameWrite){
        System.out.println("Введите количество игрушек для розыгрыша:  ");
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
       List<Toy> fileList = fileService.readFileToy(fileName);
       List<Toy> winList = toyService.winToy(n, fileList);
       fileService.writeFileToy(fileNameWrite, winList );
    }

    public void writToy(String name){
        fileService.writeFileToy(name, toyService.getAllToy() );
    }
}
