package raceGui;

import java.util.Random;

import javax.swing.JPanel;

import car.Body;
import car.Car;
import car.Engine;
import car.EngineBlock;
import car.Frame;
import car.TireType;
import car.Tires;

public class RaceDisplay extends JPanel {
	Car playerCar;
	Car cpuCar;
	static Random random;

	/**
	 * Create the panel.
	 */
	public RaceDisplay(Car playerCar) {

		// cars body engine tires
		random = new Random();
		makeCpuCar();
		this.playerCar = playerCar;

	}

	private void makeCpuCar() {
		cpuCar = new Car(new Body(randomEnum(Frame.class)), new Engine(randomEnum(EngineBlock.class)),
				new Tires(randomEnum(TireType.class)));
	}

	public static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
		int x = random.nextInt(clazz.getEnumConstants().length);
		return clazz.getEnumConstants()[x];
	}

}
