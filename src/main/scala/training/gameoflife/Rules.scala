package com.fabernovel.training.gameoflife

trait Rules {
  def applyRules (cell: Cell, aliveNeighbours: Int): Cell
}
