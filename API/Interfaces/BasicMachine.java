package Reika.RotaryCraft.API.Interfaces;


/** All RC/ReC/ElC machines implement this. */
public interface BasicMachine {

	/** For display purposes */
	public String getName();

	/** A more accurate way of checking if the machine has an inventory than just instanceof IInventory. */
	public boolean hasAnInventory();

	/** A more accurate way of checking if the machine interfaces with pipes than just instanceof IFluidHandler. */
	public boolean hasATank();

}