package furamaResort.services.house;

import furamaResort.models.Facility;

import java.util.Map;

public interface IReadAndWriteFileHouse {
    public void writeHouseList(Facility house);
    public Map<Facility,Integer> readHouseList();
}
