/**
* add this class for sort by Duration by Peter Chung CR1
 */

package net.sourceforge.atunes.model.player;

import java.util.Comparator;

import net.sourceforge.atunes.kernel.modules.repository.audio.AudioFile;


public class PlayListDurationComparator implements Comparator {

	public static PlayListDurationComparator comparator = new PlayListDurationComparator();
	
	public int compare(Object o1, Object o2) {
		AudioFile f1 = (AudioFile) o1;
		AudioFile f2 = (AudioFile) o2;
		if(f1.getDuration() == f2.getDuration()) 
			return 0;
		else if (f1.getDuration() > f2.getDuration())
			return 1;
		else
			return -1;	
	}

}