package messpace.QuantumWizardry.blocks;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import messpace.QuantumWizardry.network.NetworkAliases;
import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockGeothermalGenerator extends Block{
	
	public boolean isPlayerSaved;
	EntityPlayer savedPlayer;
	
	
	public BlockGeothermalGenerator(Material material) {
		super(material);
	}
	
	@Override
	public boolean onBlockActivated( World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		NetworkAliases alias = new NetworkAliases();
		PlayerNetworkManager networkManager = PlayerNetworkManager.get(player);
		if(isMultiBlockStructure(world, x, y, z)) {
			if(y <= 10) {
				networkManager.addEnergy(50);
			}
		}
		return true;
	}
	
	public boolean isMultiBlockStructure(World world, int x, int y, int z) {
		if (checkNorth(world, x, y, z))
			return true;
		if (checkEast(world, x, y, z))
			return true;
		if (checkSouth(world, x, y, z))
			return true;
		if (checkWest(world, x, y, z))
			return true;
		return false;
	}

	private static boolean checkNorth(World world, int x, int y, int z) {
		if (world.getBlock(x + -1, y + 0, z + 0) == Blocks.nether_brick) {
			if (world.getBlock(x + -1, y + 0, z + -1) == Blocks.obsidian) {
				if (world.getBlock(x + -1, y + 0, z + -2) == Blocks.nether_brick) {
					if (world.getBlock(x + -1, y + 1, z + 0) == Blocks.iron_bars) {
						if (world.getBlock(x + -1, y + 1, z + -1) == Blocks.iron_bars) {
							if (world.getBlock(x + -1, y + 1, z + -2) == Blocks.iron_bars) {
								if (world.getBlock(x + -1, y + 2, z + 0) == Blocks.air) {
									if (world.getBlock(x + -1, y + 2, z + -1) == Blocks.air) {
										if (world.getBlock(x + -1, y + 2, z
												+ -2) == Blocks.air) {
											if (world.getBlock(x + 0, y + 0,
													z + -1) == Blocks.obsidian) {
												if (world.getBlock(x + 0,
														y + 0, z + -2) == Blocks.obsidian) {
													if (world.getBlock(x + 0,
															y + 1, z + 0) == Blocks.stone_brick_stairs) {
														if (world.getBlock(
																x + 0, y + 1, z
																		+ -1) == Blocks.netherrack) {
															if (world
																	.getBlock(
																			x + 0,
																			y + 1,
																			z
																					+ -2) == Blocks.iron_bars) {
																if (world
																		.getBlock(
																				x + 0,
																				y + 2,
																				z + 0) == Blocks.air) {
																	if (world
																			.getBlock(
																					x + 0,
																					y + 2,
																					z
																							+ -1) == Blocks.fire) {
																		if (world
																				.getBlock(
																						x + 0,
																						y + 2,
																						z
																								+ -2) == Blocks.air) {
																			if (world
																					.getBlock(
																							x + 1,
																							y + 0,
																							z + 0) == Blocks.nether_brick) {
																				if (world
																						.getBlock(
																								x + 1,
																								y + 0,
																								z
																										+ -1) == Blocks.obsidian) {
																					if (world
																							.getBlock(
																									x + 1,
																									y + 0,
																									z
																											+ -2) == Blocks.nether_brick) {
																						if (world
																								.getBlock(
																										x + 1,
																										y + 1,
																										z + 0) == Blocks.iron_bars) {
																							if (world
																									.getBlock(
																											x + 1,
																											y + 1,
																											z
																													+ -1) == Blocks.iron_bars) {
																								if (world
																										.getBlock(
																												x + 1,
																												y + 1,
																												z
																														+ -2) == Blocks.iron_bars) {
																									if (world
																											.getBlock(
																													x + 1,
																													y + 2,
																													z + 0) == Blocks.air) {
																										if (world
																												.getBlock(
																														x + 1,
																														y + 2,
																														z
																																+ -1) == Blocks.air) {
																											if (world
																													.getBlock(
																															x + 1,
																															y + 2,
																															z
																																	+ -2) == Blocks.air) {
																												return true;
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean checkEast(World world, int x, int y, int z) {
		if (world.getBlock(x + 0, y + 0, z + -1) == Blocks.nether_brick) {
			if (world.getBlock(x + 1, y + 0, z + -1) == Blocks.obsidian) {
				if (world.getBlock(x + 2, y + 0, z + -1) == Blocks.nether_brick) {
					if (world.getBlock(x + 0, y + 1, z + -1) == Blocks.iron_bars) {
						if (world.getBlock(x + 1, y + 1, z + -1) == Blocks.iron_bars) {
							if (world.getBlock(x + 2, y + 1, z + -1) == Blocks.iron_bars) {
								if (world.getBlock(x + 0, y + 2, z + -1) == Blocks.air) {
									if (world.getBlock(x + 1, y + 2, z + -1) == Blocks.air) {
										if (world.getBlock(x + 2, y + 2, z
												+ -1) == Blocks.air) {
											if (world.getBlock(x + 1, y + 0,
													z + 0) == Blocks.obsidian) {
												if (world.getBlock(x + 2,
														y + 0, z + 0) == Blocks.obsidian) {
													if (world.getBlock(x + 0,
															y + 1, z + 0) == Blocks.stone_brick_stairs) {
														if (world.getBlock(
																x + 1, y + 1,
																z + 0) == Blocks.netherrack) {
															if (world
																	.getBlock(
																			x + 2,
																			y + 1,
																			z + 0) == Blocks.iron_bars) {
																if (world
																		.getBlock(
																				x + 0,
																				y + 2,
																				z + 0) == Blocks.air) {
																	if (world
																			.getBlock(
																					x + 1,
																					y + 2,
																					z + 0) == Blocks.fire) {
																		if (world
																				.getBlock(
																						x + 2,
																						y + 2,
																						z + 0) == Blocks.air) {
																			if (world
																					.getBlock(
																							x + 0,
																							y + 0,
																							z + 1) == Blocks.nether_brick) {
																				if (world
																						.getBlock(
																								x + 1,
																								y + 0,
																								z + 1) == Blocks.obsidian) {
																					if (world
																							.getBlock(
																									x + 2,
																									y + 0,
																									z + 1) == Blocks.nether_brick) {
																						if (world
																								.getBlock(
																										x + 0,
																										y + 1,
																										z + 1) == Blocks.iron_bars) {
																							if (world
																									.getBlock(
																											x + 1,
																											y + 1,
																											z + 1) == Blocks.iron_bars) {
																								if (world
																										.getBlock(
																												x + 2,
																												y + 1,
																												z + 1) == Blocks.iron_bars) {
																									if (world
																											.getBlock(
																													x + 0,
																													y + 2,
																													z + 1) == Blocks.air) {
																										if (world
																												.getBlock(
																														x + 1,
																														y + 2,
																														z + 1) == Blocks.air) {
																											if (world
																													.getBlock(
																															x + 2,
																															y + 2,
																															z + 1) == Blocks.air) {
																												return true;
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean checkSouth(World world, int x, int y, int z) {
		if (world.getBlock(x + 1, y + 0, z + 0) == Blocks.nether_brick) {
			if (world.getBlock(x + 1, y + 0, z + 1) == Blocks.obsidian) {
				if (world.getBlock(x + 1, y + 0, z + 2) == Blocks.nether_brick) {
					if (world.getBlock(x + 1, y + 1, z + 0) == Blocks.iron_bars) {
						if (world.getBlock(x + 1, y + 1, z + 1) == Blocks.iron_bars) {
							if (world.getBlock(x + 1, y + 1, z + 2) == Blocks.iron_bars) {
								if (world.getBlock(x + 1, y + 2, z + 0) == Blocks.air) {
									if (world.getBlock(x + 1, y + 2, z + 1) == Blocks.air) {
										if (world.getBlock(x + 1, y + 2,
												z + 2) == Blocks.air) {
											if (world.getBlock(x + 0, y + 0,
													z + 1) == Blocks.obsidian) {
												if (world.getBlock(x + 0,
														y + 0, z + 2) == Blocks.obsidian) {
													if (world.getBlock(x + 0,
															y + 1, z + 0) == Blocks.stone_brick_stairs) {
														if (world.getBlock(
																x + 0, y + 1,
																z + 1) == Blocks.netherrack) {
															if (world
																	.getBlock(
																			x + 0,
																			y + 1,
																			z + 2) == Blocks.iron_bars) {
																if (world
																		.getBlock(
																				x + 0,
																				y + 2,
																				z + 0) == Blocks.air) {
																	if (world
																			.getBlock(
																					x + 0,
																					y + 2,
																					z + 1) == Blocks.fire) {
																		if (world
																				.getBlock(
																						x + 0,
																						y + 2,
																						z + 2) == Blocks.air) {
																			if (world
																					.getBlock(
																							x
																									+ -1,
																							y + 0,
																							z + 0) == Blocks.nether_brick) {
																				if (world
																						.getBlock(
																								x
																										+ -1,
																								y + 0,
																								z + 1) == Blocks.obsidian) {
																					if (world
																							.getBlock(
																									x
																											+ -1,
																									y + 0,
																									z + 2) == Blocks.nether_brick) {
																						if (world
																								.getBlock(
																										x
																												+ -1,
																										y + 1,
																										z + 0) == Blocks.iron_bars) {
																							if (world
																									.getBlock(
																											x
																													+ -1,
																											y + 1,
																											z + 1) == Blocks.iron_bars) {
																								if (world
																										.getBlock(
																												x
																														+ -1,
																												y + 1,
																												z + 2) == Blocks.iron_bars) {
																									if (world
																											.getBlock(
																													x
																															+ -1,
																													y + 2,
																													z + 0) == Blocks.air) {
																										if (world
																												.getBlock(
																														x
																																+ -1,
																														y + 2,
																														z + 1) == Blocks.air) {
																											if (world
																													.getBlock(
																															x
																																	+ -1,
																															y + 2,
																															z + 2) == Blocks.air) {
																												return true;
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean checkWest(World world, int x, int y, int z) {
		if (world.getBlock(x + 0, y + 0, z + 1) == Blocks.nether_brick) {
			if (world.getBlock(x + -1, y + 0, z + 1) == Blocks.obsidian) {
				if (world.getBlock(x + -2, y + 0, z + 1) == Blocks.nether_brick) {
					if (world.getBlock(x + 0, y + 1, z + 1) == Blocks.iron_bars) {
						if (world.getBlock(x + -1, y + 1, z + 1) == Blocks.iron_bars) {
							if (world.getBlock(x + -2, y + 1, z + 1) == Blocks.iron_bars) {
								if (world.getBlock(x + 0, y + 2, z + 1) == Blocks.air) {
									if (world.getBlock(x + -1, y + 2, z + 1) == Blocks.air) {
										if (world.getBlock(x + -2, y + 2,
												z + 1) == Blocks.air) {
											if (world.getBlock(x + -1, y + 0,
													z + 0) == Blocks.obsidian) {
												if (world.getBlock(x + -2,
														y + 0, z + 0) == Blocks.obsidian) {
													if (world.getBlock(x + 0,
															y + 1, z + 0) == Blocks.stone_brick_stairs) {
														if (world.getBlock(x
																+ -1, y + 1,
																z + 0) == Blocks.netherrack) {
															if (world
																	.getBlock(
																			x
																					+ -2,
																			y + 1,
																			z + 0) == Blocks.iron_bars) {
																if (world
																		.getBlock(
																				x + 0,
																				y + 2,
																				z + 0) == Blocks.air) {
																	if (world
																			.getBlock(
																					x
																							+ -1,
																					y + 2,
																					z + 0) == Blocks.fire) {
																		if (world
																				.getBlock(
																						x
																								+ -2,
																						y + 2,
																						z + 0) == Blocks.air) {
																			if (world
																					.getBlock(
																							x + 0,
																							y + 0,
																							z
																									+ -1) == Blocks.nether_brick) {
																				if (world
																						.getBlock(
																								x
																										+ -1,
																								y + 0,
																								z
																										+ -1) == Blocks.obsidian) {
																					if (world
																							.getBlock(
																									x
																											+ -2,
																									y + 0,
																									z
																											+ -1) == Blocks.nether_brick) {
																						if (world
																								.getBlock(
																										x + 0,
																										y + 1,
																										z
																												+ -1) == Blocks.iron_bars) {
																							if (world
																									.getBlock(
																											x
																													+ -1,
																											y + 1,
																											z
																													+ -1) == Blocks.iron_bars) {
																								if (world
																										.getBlock(
																												x
																														+ -2,
																												y + 1,
																												z
																														+ -1) == Blocks.iron_bars) {
																									if (world
																											.getBlock(
																													x + 0,
																													y + 2,
																													z
																															+ -1) == Blocks.air) {
																										if (world
																												.getBlock(
																														x
																																+ -1,
																														y + 2,
																														z
																																+ -1) == Blocks.air) {
																											if (world
																													.getBlock(
																															x
																																	+ -2,
																															y + 2,
																															z
																																	+ -1) == Blocks.air) {
																												return true;
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

}
