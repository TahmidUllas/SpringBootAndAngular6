import { TestBed } from '@angular/core/testing';

import { NidService } from './nid.service';

describe('NidService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: NidService = TestBed.get(NidService);
    expect(service).toBeTruthy();
  });
});
