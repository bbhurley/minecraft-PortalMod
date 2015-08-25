package io.github.derpsquad.portalmod.block;


public class PortalModBlocks {
	
	public static ModBlock basicPortal;
	public static ModBlock kiln;
	
	public static void init() {
		basicPortal = new BlockSpawnTeleporter();
		kiln = new BlockKiln();
	}
}
