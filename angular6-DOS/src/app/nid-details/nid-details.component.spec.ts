import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NidDetailsComponent } from './nid-details.component';

describe('NidDetailsComponent', () => {
  let component: NidDetailsComponent;
  let fixture: ComponentFixture<NidDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NidDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NidDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
