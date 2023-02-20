import { WebPlugin } from '@capacitor/core';

import type { TelephoneMangerPlugin } from './definitions';

export class TelephoneMangerWeb
  extends WebPlugin
  implements TelephoneMangerPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
