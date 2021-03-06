import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NidService {

  private baseUrl = '/api/v1/NIDs';

  constructor(private http: HttpClient) { }

  getNid(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createNid(Nid: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, Nid);
  }

  updateNid(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteNid(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getNidList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
