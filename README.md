# Tyche ![build](https://travis-ci.org/neysofu/tyche.svg?branch=master) ![scala version](https://img.shields.io/badge/scala-2.12.0-blue.svg)
Tyche is a small and robust statistical library for the JVM. Many JVM-hosted numerical libraries offer similar functionalities, but they seem to be unnecessarily bloated and they fail to provide straightforward APIs. Instead, Tyche is built from the ground up in accordance to good design principles.

Tyche is tiny and yet badass. Here's why:

- Discrete & Continuous distributions.
- Foolproof analysis tools.
- Efficient numerical manipulation techniques.
- The coolest Markov chains you'll ever see.
- Fully modular design.
- Simple Random Sampling (SRS) support.
- **Extensive** documentation!
- Enviable test coverage.

The library is written in Scala 2.12.0 and was tested last with sbt 0.13.13.

Behold, the power of Tyche:

	// In a country in which people only want boys every family continues to
	// have children until they have a boy. If they have a girl, they have
	// another child. If they have a boy, they stop. What is the average
	// amount of kids per family?

    val sampleSize = 10000

	sealed trait Child
	object Boy extends Child
	object Girl extends Child

	val family = tyche.DiscreteDistribution.uniform(Boy, Girl)
		.until(_ contains Boy)
		.map(_.size)

	println(Math.round(1.0 * family.take(sampleSize).sum / sampleSize)) // 2

## Setup
Tyche is published to *Maven Central*, so you just need to paste this line in you build configuration file:

	libraryDependencies += "com.github.neysofu" %% "tyche" % "0.4.3"

## How to contribute
Feedback and suggestions are very welcome! I invite you to check for open [issues](https://github.com/neysofu/tyche/issues) or open a fresh one to discuss around a bug or a feature idea. Please drop me a line at `filippocosta.italy@gmail.com` if you wish you contact me.

Bonus points if you submit code!

1. Branch off from **master** and start making your changes.
2. Write a test which shows that the code works as expected.
3. Please, please write some documentation. One or two lines per entity are enough.
4. Send a pull request.
