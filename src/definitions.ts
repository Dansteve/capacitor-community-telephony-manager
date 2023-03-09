export interface TelephoneMangerPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  getImei(): Promise<{ value: string }>;
  getMeid(): Promise<{ value: string }>;
  getSimSerialNumber(): Promise<{ value: string }>;
}