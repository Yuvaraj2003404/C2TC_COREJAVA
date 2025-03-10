import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PlacementService {
  API = "http://localhost:8080";

  public registerPlacement(placementData: any) {
    return this.http.post(`${this.API}/placement`, placementData);
  }

  public getPlacements() {
    return this.http.get(`${this.API}/placement`);
  }

  public deletePlacement(placementId: any) {
    return this.http.delete(`${this.API}/placement/${placementId}`);
  }

  public updatePlacement(placement: any) {
    return this.http.put(`${this.API}/placement/${placement.id}`, placement);
  }

  constructor(private http: HttpClient) { }
}
