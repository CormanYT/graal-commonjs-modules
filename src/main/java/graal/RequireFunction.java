/*
 * Copyright 2018 Transposit Corporation. All Rights Reserved.
 */

package graal;

import org.graalvm.polyglot.PolyglotException;

@FunctionalInterface
public interface RequireFunction {
  public Object require(String module) throws PolyglotException;
}
