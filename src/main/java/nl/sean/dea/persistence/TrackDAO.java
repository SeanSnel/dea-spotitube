package nl.sean.dea.persistence;

import nl.sean.dea.dto.TrackDTO;
import nl.sean.dea.dto.TracksDTO;

import java.util.List;

public interface TrackDAO {
    TracksDTO getAllTracks();

    TracksDTO getAllTracksFromPlaylist(int playlistID);

    void addTracksToPlaylist(List<TrackDTO> tracks, int insertedID);
}
