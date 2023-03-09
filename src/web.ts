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

  async getImei(): Promise<{ value: string }> {
    // throw new Error('Method not implemented on web.');
    const imei = new Error('Method not implemented on web.');
    return { value: imei.message };
  }

  async getMeid(): Promise<{ value: string }> {
    // throw new Error('Method not implemented on web.');
    const meid = new Error('Method not implemented on web.');
    return { value: meid.message };
  }

  async getSimSerialNumber(): Promise<{ value: string }> {
    // throw new Error('Method not implemented on web.');
    const simSerialNumber = new Error('Method not implemented on web.');
    return { value: simSerialNumber.message };
  }
}
