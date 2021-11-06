package furamaResort.services.room;

import furamaResort.models.Facility;

import java.util.Map;

public interface IReadAndWriteFileRoom {
    public void writeRoomList(Facility room);
    public Map<Facility,Integer> readRoomList();
}
