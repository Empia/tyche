package io.neysofu.tyche

/** This trait defines the essential properties of all probability
 *  distributions:
 *   1. Plotting;
 *   2. expected value (mean);
 *   3. standard deviation;
 *  and other [[https://goo.gl/p4TGzt moments]].
 */
trait Moments[A] {

  /** Draws a plot with Unicode characters.
   */
  def plot(implicit toDouble: A <:< Double): String

  /** Computes the [[https://goo.gl/LruXGw expected value]] (mean).
   */
  def mean(implicit toDouble: A <:< Double): Double

  /** Computes the [[https://goo.gl/QrSlFY standard deviation]].
   */
  def standardDeviation(implicit toDouble: A <:< Double): Double

  /** Computes the [[https://goo.gl/Wzlr6p variance]].
   */
  def variance(implicit toDouble: A <:< Double): Double =
    Math.pow(standardDeviation, 2)
}