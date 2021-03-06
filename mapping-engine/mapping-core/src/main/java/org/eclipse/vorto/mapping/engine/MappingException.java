/**
 * Copyright (c) 2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.vorto.mapping.engine;

/**
 * 
 * Exception that occurs if something goes wrong during mapping execution
 */
public class MappingException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public MappingException(String msg) {
    super(msg);
  }

  public MappingException(String msg, Throwable t) {
    super(msg, t);
  }
}
