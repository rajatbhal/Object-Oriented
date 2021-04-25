package module6;

import java.util.List;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;
import processing.core.PConstants;
import processing.core.PGraphics;

/** 
 * A class to represent AirportMarkers on a world map.
 *   
 * @author Adam Setters and the UC San Diego Intermediate Software Development
 * MOOC team
 *
 */
public class AirportMarker extends CommonMarker {
	public static List<SimpleLinesMarker> routes;
	
	public AirportMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
	
	}
	
	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		
		
		pg.pushStyle();
		pg.fill(11);
		pg.ellipse(x, y, 5, 5);
		
		
		pg.popStyle();
				
		
	}

	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		 // show rectangle with title
		
		// show routes
		String to_display = "" + this.getStringProperty("name") + ", " + this.getStringProperty("city") + ", " + this.getStringProperty("country"); 
		
		pg.rectMode(PConstants.CORNER);
		pg.stroke(110);
		pg.fill(255, 255, 255);
		pg.rect(x, y+15, pg.textWidth(to_display)+6, 18, 5 );
		pg.textAlign(PConstants.LEFT, PConstants.TOP);
		pg.fill(0);
		pg.text(to_display, x+3, y+18);
		
		
		
	}
	
}