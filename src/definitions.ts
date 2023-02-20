export interface TelephoneMangerPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
