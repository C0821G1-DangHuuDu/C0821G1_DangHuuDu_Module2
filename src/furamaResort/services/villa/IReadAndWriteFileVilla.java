package furamaResort.services.villa;

import furamaResort.models.Facility;

import java.util.Map;

public interface IReadAndWriteFileVilla {
    public void writeVillaList(Facility villa);
    public Map<Facility,Integer> readVillaList();
}
