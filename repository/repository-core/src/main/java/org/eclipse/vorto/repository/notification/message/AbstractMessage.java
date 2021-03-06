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
package org.eclipse.vorto.repository.notification.message;

import org.eclipse.vorto.repository.account.User;
import org.eclipse.vorto.repository.notification.IMessage;

public abstract class AbstractMessage implements IMessage {

  protected User recipient;

  public AbstractMessage(User recipient) {
    this.recipient = recipient;
  }

  @Override
  public User getRecipient() {
    return recipient;
  }

}
