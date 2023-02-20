import { registerPlugin } from '@capacitor/core';

import type { TelephoneMangerPlugin } from './definitions';

const TelephoneManger = registerPlugin<TelephoneMangerPlugin>(
  'TelephoneManger',
  {
    web: () => import('./web').then(m => new m.TelephoneMangerWeb()),
  },
);

export * from './definitions';
export { TelephoneManger };
