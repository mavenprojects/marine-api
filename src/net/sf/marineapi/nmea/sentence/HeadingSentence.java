/* 
 * HeadingSentence.java
 * Copyright (C) 2011 Kimmo Tuukkanen
 * 
 * This file is part of Java Marine API.
 * <http://sourceforge.net/projects/marineapi/>
 * 
 * Java Marine API is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Java Marine API is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java Marine API. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.marineapi.nmea.sentence;

/**
 * Interface for sentences that provide vessel's true or magnetic heading.
 * 
 * @author Kimmo Tuukkanen
 * @version $Revision$
 */
public interface HeadingSentence extends Sentence {

    /**
     * Returns the vessel's current heading.
     * 
     * @return Heading, in degrees.
     */
    double getHeading();

    /**
     * Sets the heading value.
     * 
     * @param hdt Heading in degrees
     * @throws IllegalArgumentException If heading value out of range [0..360]
     */
    void setHeading(double hdt);

    /**
     * Tells if the sentence holds true heading.
     * 
     * @return <code>true</code> if true heading, otherwise <code>false</code>
     *         for magnetic heading.
     */
    boolean isTrue();
}