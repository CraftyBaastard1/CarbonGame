package com.carbon.game;

import org.xguzm.pathfinding.grid.GridCell;

import java.util.ArrayList;
import java.util.List;

public class TrainLine {
    String name;
    ArrayList<Station> stationList;
    List<GridCell> path;
    public TrainLine(String name) {
        this.name = name;
        stationList = new ArrayList<Station>();
    }

    public void addStation(Station s) {
        stationList.add(s);
    }

    public Station nextStation(Station current) {
        int currentIndex = stationList.indexOf(current);
        if (currentIndex < stationList.size() - 1) {
            return stationList.get(currentIndex + 1);
        } else {
            return null;
        }
    }

    public void setPath(List<GridCell> path) {
        this.path = path;
    }

    //test
    public void print() {
        System.out.println(path);
        System.out.println(stationList);
    }
}
